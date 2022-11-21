package org.example;

import jdk.jfr.Frequency;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {

    @Test
    void checkWordBalloon()
    {
        //given

        String line0time = "ball";

        String line1time = "BALLOON";

        String line2times = "balloonballoon";

        String line3times = "balloonballoonballoonhjk";

        String lineLongWord = "asdfghjklčasdfghjklčasdfghjklčasdfghjklčasdfghjklčasdfghjklčasdfghjklčasdfghjklčasdfghjklčasdfghjklčasdfghjklč";

        String emptyWord = "";

      Solution1 solution1=new Solution1();
      int result=solution1.checkWordBalloon(line3times);
      assertEquals(3,result);

      Solution1 solution2=new Solution1();
      int result2=solution2.checkWordBalloon(line2times);
      assertEquals(2,result2);

      Solution1 solution3=new Solution1();
      int result3=solution3.checkWordBalloon(line1time);
      assertEquals(1,result3);

      Solution1 solution4=new Solution1();
      int result4=solution4.checkWordBalloon(line0time);
      assertEquals(0,result4);

      Solution1 solution5=new Solution1();
      int result5=solution5.checkWordBalloon(lineLongWord);
      assertEquals("Word is too long",result5);

      Solution1 solution6=new Solution1();
      int result6=solution6.checkWordBalloon(emptyWord);
      assertEquals(0,result6);



    }
}