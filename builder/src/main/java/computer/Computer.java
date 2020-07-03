package computer;

import lombok.Data;

/**
 * 电脑类
 * 被建造的产品
 */
@Data
public class Computer {
    /**
     * 中央处理器
     */
    private String cpu;

    /**
     * 内存
     */
    private String memory;

    /**
     * 硬盘
     */
    private String disk;
}
