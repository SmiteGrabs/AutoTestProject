package Lesson4;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.stream.Stream;

import static Lesson4.AreaOfTriangle.AreaCalculate;

public class AreaOfTriangleTest
{

    private static Logger logger = LoggerFactory.getLogger("AreaOfTriangleTest.class");

    @BeforeAll
    static void beforeAll()
    {
        logger.debug("Debug");

    }

    @ParameterizedTest
    @MethodSource("DataProvider")
    public void areaCalculateTest(int[]a,String b)
    {
        try {
            Assertions.assertEquals(b,AreaCalculate(a));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    @Test
    void exceptionTest()
    {
        int[] a= new int[]{1,1,1,1};
        Assertions.assertThrows(IllegalArgumentException.class,()->AreaCalculate(a));
    }

    public static Stream<Arguments> DataProvider()
    {
        return  Stream.of(
                Arguments.of(new int[]{1,2,3},"0"),
                Arguments.of(new int[]{4,4,2},"3,87")//Отформатированные числа не конвертируются обратно в float из-за запятой, потому паримся с такой проверкой
        );
    }
}
