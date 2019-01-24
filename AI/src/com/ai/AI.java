package com.ai;

import com.java.service.impl.PetstoreServiceImpl;
import com.java.test.PetTest;

import java.util.Scanner;

public class AI {

  /*  public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //AI核心代码
        while (true) {
            String nextLine = input.nextLine().replaceAll("嘛", "")
                    .replaceAll("吗", "")
                    .replaceAll("你大爷", "你二大爷")
                    .replaceAll("？", "!");
            System.out.println(nextLine);
        }

    }*/


}

class i {

    public static void main(String[] args) {

        PetstoreServiceImpl pst = new PetstoreServiceImpl();
        pst.login();

    }
}
