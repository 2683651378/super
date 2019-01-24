package com.ai;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

public class AIDemo {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
     /*   String sre = null;
        InputStream isr = null;
        isr = new FileInputStream("H:\\开发工具\\IDEA\\IDEA破解.txt");
        int data = 0;
        byte[] key = new byte[1024];
        while ((data = isr.read(key)) != -1) {
            System.out.println(new String(key, 0, data));
            sre = new String(key, 0, data);
        }
*/
        do {

            // 创建与微软应用程序的新连接。传入的参数是注册表中注册的程序的名称。
            ActiveXComponent sap = new ActiveXComponent("Sapi.SpVoice");
            try {

                String line = input.nextLine()
                       .replaceAll("嘛", "")
                        .replaceAll("吗", "")
                        .replaceAll("你是傻逼", "你骂谁呢!你个龟孙子");

                // 音量 0-100
                sap.setProperty("Volume", new Variant(100));
                // 语音朗读速度 -10 到 +10
                sap.setProperty("Rate", new Variant(-2));
                // 获取执行对象
                Dispatch sapo = sap.getObject();
                // 执行朗读
                Dispatch.call(sapo, "Speak", new Variant(line));
                // 关闭执行对象
                sapo.safeRelease();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // 关闭应用程序连接
                sap.safeRelease();
            }
        } while (true);
    }

}

