package org.example;

import jdk.jfr.Frequency;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import org.junit.Before;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {


    Solution1 testingSolution= new Solution1();

    @Before
    public void SetUp(){
        testingSolution=mock(Solution1.class);
    }
    @Test
    void checkWordBalloon()
    {

        String line0time = "ball";

        String line1time = "BALLOON";

        String line2times = "balloonballoon";

        String line3times = "balloonballoonballoonhjk";

        String lineLongWord = "asdfghjklčasdfghjklčasdfghjklčasdfghjklčasdfghjklčasdfghjklčasdfghjklčasdfghjklčasdfghjklčasdfghjklčasdfghjklč";

        String emptyWord = "";


      Solution1 solution1=new Solution1();
      int result=solution1.checkWordBalloon(line3times);
      assertEquals(3,testingSolution.equals(result));

      Solution1 solution2=new Solution1();
      int result2=solution2.checkWordBalloon(line2times);
      assertEquals(2,testingSolution.equals(result2));

      Solution1 solution3=new Solution1();
      int result3=solution3.checkWordBalloon(line1time);
      assertEquals(1,testingSolution.equals(result3));

      Solution1 solution4=new Solution1();
      int result4=solution4.checkWordBalloon(line0time);
      assertEquals(0,testingSolution.equals(result4));

      Solution1 solution5=new Solution1();
      int result5=solution5.checkWordBalloon(lineLongWord);
      assertEquals("Word is too long",testingSolution.equals(result5));

      Solution1 solution6=new Solution1();
      int result6=solution6.checkWordBalloon(emptyWord);
      assertEquals(0,testingSolution.equals(result6));



    }
}