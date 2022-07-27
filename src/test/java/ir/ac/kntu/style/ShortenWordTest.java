package ir.ac.kntu.style;

import ir.ac.kntu.ShortenWord;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


/**
 * @author Mohammad Amin Shafiee
 */

class TestObj{
    int n;
    String word;
    String answer;

    public TestObj(int n, String word, String answer){
        this.word = word;
        this.answer = answer;
        this.n = n;
    }
}

public class ShortenWordTest {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String PASSED = "\"$$$GRADER$$$ | { type:\\\"SCORE\\\" , amount:5 , reason:\\\"Test Passed.\\\" } | $$$GRADER$$$\"";
    private ArrayList<TestObj>tests = new ArrayList<>();

    static {
        System.err.println(ANSI_CYAN + "$$$GRADER$$$ | { type:\"MSG\" , key:\"TOTAL\" , value:40, priority:1  }  | $$$GRADER$$$" + ANSI_RESET);
    }

    public void getTests(){
        String test = "roof";
        tests.add(new TestObj(2, test, "rf")) ;
        test = "roooof";
        tests.add(new TestObj(3, test, "rof")) ;
        test = "rooooff";
        tests.add(new TestObj(3, test, "roff")) ;
        test = "AAAAARRABBF";
        tests.add(new TestObj(2, test, "F")) ;
        test = "AAAAARRABBFgGGoppoo";
        tests.add(new TestObj(2, test, "Fgo")) ;
        test = "SSSGGGGGGUUUIIIIIIIIIIUUUUUUUGGNNNNNNPPPOOOOOOOOOOPPPPPPPNNNNGGSSSSSSZZZYYYZZYZYZY";
        tests.add(new TestObj(10, test, "SSSSSSSSSZZZYYYZZYZYZY")) ;
        test = "fffeppppiijjjjikkkkieeelopoo;;;;o[[[[ohhtttnnnnthhooo";
        tests.add(new TestObj(4, test, "ffflopooo"));
        test = "vpppvviooooiippppi";
        tests.add(new TestObj(4, test, "vpppvv"));
        test = "sanaaanooonppn";
        tests.add(new TestObj(2, test, "sanano"));
        test = "surprise";
        tests.add(new TestObj(4, test, "surprise"));
        tests.add(new TestObj(4, null, null));
        tests.add(new TestObj(1,test, ""));
    }

    @Before
    public void setup(){
        getTests();
    }

    @Test
    public void test1(){
        TestObj testObj = tests.get(0);
        System.err.print(ANSI_RED);
        TestCase.assertEquals(testObj.answer, ShortenWord.solve(testObj.n, testObj.word));
        System.err.print(ANSI_RESET);
        System.err.println(ANSI_GREEN + PASSED + ANSI_RESET);
    }

    @Test
    public void test2(){
        TestObj testObj = tests.get(1);
        System.err.print(ANSI_RED);
        TestCase.assertEquals(testObj.answer, ShortenWord.solve(testObj.n, testObj.word));
        System.err.print(ANSI_RESET);
        System.err.println(ANSI_GREEN + PASSED + ANSI_RESET);
    }

    @Test
    public void test3(){
        TestObj testObj = tests.get(2);
        System.err.print(ANSI_RED);
        TestCase.assertEquals(testObj.answer, ShortenWord.solve(testObj.n, testObj.word));
        System.err.print(ANSI_RESET);
        System.err.println(ANSI_GREEN + PASSED + ANSI_RESET);
    }

    @Test
    public void test4(){
        TestObj testObj = tests.get(3);
        System.err.print(ANSI_RED);
        TestCase.assertEquals(testObj.answer, ShortenWord.solve(testObj.n, testObj.word));
        System.err.print(ANSI_RESET);
        System.err.println(ANSI_GREEN + PASSED + ANSI_RESET);
    }

    @Test
    public void test5(){
        TestObj testObj = tests.get(4);
        System.err.print(ANSI_RED);
        TestCase.assertEquals(testObj.answer, ShortenWord.solve(testObj.n, testObj.word));
        System.err.print(ANSI_RESET);
        System.err.println(ANSI_GREEN + PASSED + ANSI_RESET);
    }

    @Test
    public void test6(){
        TestObj testObj = tests.get(5);
        System.err.print(ANSI_RED);
        TestCase.assertEquals(testObj.answer, ShortenWord.solve(testObj.n, testObj.word));
        System.err.print(ANSI_RESET);
        System.err.println(ANSI_GREEN + PASSED + ANSI_RESET);
    }

    @Test
    public void test7(){
        TestObj testObj = tests.get(6);
        System.err.print(ANSI_RED);
        TestCase.assertEquals(testObj.answer, ShortenWord.solve(testObj.n, testObj.word));
        System.err.print(ANSI_RESET);
        System.err.println(ANSI_GREEN + PASSED + ANSI_RESET);
    }

    @Test
    public void testEmpty(){
        TestCase.assertEquals("",ShortenWord.solve(1, "")) ;
        System.err.println(ANSI_GREEN + PASSED + ANSI_RESET) ;
    }

    @Test
    public void test8(){
        TestObj testObj = tests.get(7);
        System.err.print(ANSI_RED);
        TestCase.assertEquals(testObj.answer, ShortenWord.solve(testObj.n, testObj.word));
        System.err.print(ANSI_RESET);
        System.err.println(ANSI_GREEN + PASSED + ANSI_RESET);
    }

    @Test
    public void test9(){
        TestObj testObj = tests.get(8);
        System.err.print(ANSI_RED);
        TestCase.assertEquals(testObj.answer, ShortenWord.solve(testObj.n, testObj.word));
        System.err.print(ANSI_RESET);
        System.err.println(ANSI_GREEN + PASSED + ANSI_RESET);
    }

    @Test
    public void test10(){
        TestObj testObj = tests.get(9);
        System.err.print(ANSI_RED);
        TestCase.assertEquals(testObj.answer, ShortenWord.solve(testObj.n, testObj.word));
        System.err.print(ANSI_RESET);
        System.err.println(ANSI_GREEN + PASSED + ANSI_RESET);
    }

    @Test
    public void test11(){
        TestObj testObj = tests.get(10);
        System.err.print(ANSI_RED);
        TestCase.assertEquals(testObj.answer, ShortenWord.solve(testObj.n, testObj.word));
        System.err.print(ANSI_RESET);
        System.err.println(ANSI_GREEN + PASSED + ANSI_RESET);
    }

    @Test
    public void test12(){
        TestObj testObj = tests.get(11);
        System.err.print(ANSI_RED);
        TestCase.assertEquals(testObj.answer, ShortenWord.solve(testObj.n, testObj.word));
        System.err.print(ANSI_RESET);
        System.err.println(ANSI_GREEN + PASSED + ANSI_RESET);
    }
}
