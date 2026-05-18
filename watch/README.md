# 手表界面版
> 因为或许直接替换ui代码会更方便，所以先用替换ui代码的方式。
>
> 能不动原来的就不动原来的，就算要动也是以后再说了。
>
> ---
> 
> 于是研究具体怎么覆盖代码
> 
> - 尝试做成FlavorDimensions，发现FlavorDimensions无法替换代码文件，会报错重复定义
>
> - 尝试做成library模块，发现library模块是被盖的那个
>
> - 暂时不知道怎么直接盖掉原来的代码的方式
>
> ---
> 
> 不过既然子模块可以覆盖代码，只不过是覆盖优先级的问题。
> 
> 那就先凑合一下，在编译时临时将原app模块的类型从application改成library，然后手表界面版弄成新application模块，这样就可以盖掉它了。
>
> 由于把它从app模块改成library模块，就会多出多余定义的字段，就会报错，所以要去掉它们，嗯反正哪里报错删哪里。

编译时先将app/build.gradle.kts做临时修改。
~当然之后如果需要git提交的话记得注意不要误提交哦~
```shell
app_build_gradle_kts=/root/Documents/AndroidStudioProjects/Yhchat_MD3/app/build.gradle.kts
sed -i 's@libs.plugins.android.library@libs.plugins.android.library@' $app_build_gradle_kts
sed -i 's@applicationId = "com.yhchat.canary"@@' $app_build_gradle_kts
sed -i 's@versionCode = 1@@' $app_build_gradle_kts
sed -i 's@versionName = resolvedVersionName@@' $app_build_gradle_kts
sed -i 's@isShrinkResources = true@@' $app_build_gradle_kts
```
