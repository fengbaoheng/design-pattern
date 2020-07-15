package eventbus;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 演示如何使用EventBus作为通用框架使用观察者模式
 */
public class App {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        EventBus eventBus = new EventBus(executorService);

        // 注册Object类型, 用户类和守卫类均可注册
        // 接收通知使用@Subscribe注解
        eventBus.register(new Guard());
        eventBus.register(new ElderlyUser("老张"));
        eventBus.register(new YoungUser("小张"));

        // 推送事件,任意类型事件均可
        // 会查找所有注册对象的@Subsribe标注的方法是否匹配事件
        eventBus.post(new SportsMessage("体育消息"));
        eventBus.post(new OperaMessage("戏曲消息"));
        eventBus.post(new ComicMessage("动漫消息"));

        executorService.shutdown();
    }
}


//region 消息类

/**
 * 消息父类
 */
abstract class Message {
    public final String content;

    public Message(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return this.content;
    }
}

/**
 * 动漫消息
 */
class ComicMessage extends Message {
    public ComicMessage(String content) {
        super(content);
    }
}

/**
 * 戏曲消息
 */
class OperaMessage extends Message {
    public OperaMessage(String content) {
        super(content);
    }
}

/**
 * 体育消息
 */
class SportsMessage extends Message {
    public SportsMessage(String content) {
        super(content);
    }
}
//endregion


//region 观察者类

abstract class User {
    public final String name;

    public User(String name) {
        this.name = name;
    }

    /**
     * 打印消息
     *
     * @param message 消息类
     */
    public void printMessage(Message message) {
        System.out.println(String.format("%s收到消息: %s", name, message.content));
    }
}

/**
 * 老年用户
 * 只接收戏曲消息
 */
class ElderlyUser extends User {

    public ElderlyUser(String name) {
        super(name);
    }

    @Subscribe
    public void receiveOpera(OperaMessage message) {
        printMessage(message);
    }
}

/**
 * 青少年用户
 * 接收动漫和体育消息
 */
class YoungUser extends User {
    public YoungUser(String name) {
        super(name);
    }

    @Subscribe
    public void receiveSports(SportsMessage message) {
        printMessage(message);
    }

    @Subscribe
    public void receiveComic(ComicMessage message) {
        printMessage(message);
    }
}


/**
 * 守卫
 * 检测所有消息
 */
class Guard {
    @Subscribe
    public void guardEvent(Object event) {
        System.out.println("守卫监测到消息: " + event);
    }
}

//endregion
