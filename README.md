## LearnActivity

#### Activity启动流程

> [framework来自master分支](https://github.com/aosp-mirror/platform_frameworks_base)
(git快速下载命令：
git clone --branch pie-release https://github.com/aosp-mirror/platform_frameworks_base.git --depth 1
)


点击Home界面的一个应用图标
```java
android.app.LauncherActivity.java





```











> [任务和返回栈](https://developer.android.google.cn/guide/components/tasks-and-back-stack?hl=zh-cn)

#### 任务和返回栈

*


#### Activity启动模式（LaunchMode）

1. standard：标准启动模式。启动新Activity将创建新实例添加到回退栈
1. singleTop：栈顶复用模式。启动新Activity时，如果Activity已经位于栈顶时，会调用该实例的onNewIntent(Intent)
方法传递参数，不会创建新Activity实例；如果Activity没有位于栈顶，将创建新实例
1. singleTask：栈内复用模式。启动新Activity时，会先根据Activity的taskAffinity查找任务栈，如果不存在会先创建
 该任务栈。然后判断Activity是否已经位于栈内，是的话会调用该实例的onNewIntent(Intent)，否则将创建新实例
1. singleInstance：单实例模式。


##### 定义启动模式

#### Activity生命周期

##### 典型情况

##### 异常情况











