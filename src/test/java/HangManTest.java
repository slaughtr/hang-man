import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class HangManTest {

  @Test
  public void newHangman_instantiatesCorrectly_true(){
    HangMan testGame = new HangMan();
    assertEquals(true, testGame instanceof HangMan);
  }

  @Test
  public void getWord_returnString_true(){
    HangMan testGame = new HangMan();
    String gotWord = testGame.getWord();
    assertEquals(true, gotWord instanceof String);
  }

  @Test
  public void getWordToArray_returnCharArray_true(){
    HangMan testGame = new HangMan();
    List<Character> charArray = testGame.getWordToArray();
    assertEquals(true, charArray.equals(Arrays.asList('p', 'o', 't', 'a', 't', 'o')));
  }

  @Test
  public void makeBlanksArray_returnArraySameLengthAsCharArray_true(){
    HangMan testGame = new HangMan();
    List<Character> charArray = testGame.getWordToArray();
    List<Character> blanksArray = testGame.makeBlanksArray();
    assertEquals(true, charArray.size() == blanksArray.size());
  }

  @Test
  public void makeBlanksArray_returnBlanksArraySameLengthAsCharArray_true(){
    HangMan testGame = new HangMan();
    List<Character> blanksArray = testGame.makeBlanksArray();
    assertEquals(Arrays.asList('-', '-', '-', '-', '-', '-'), blanksArray);
  }

  @Test
  public void wordContainsLetter_returnTrueIfWordContainsLetter_true(){
    HangMan testGame = new HangMan();
    assertEquals(true, testGame.wordContainsLetter('a'));
  }

  @Test
  public void wordContainsLetter_returnFalseIfWordDoesNotContainLetter_false(){
    HangMan testGame = new HangMan();
    assertEquals(false, testGame.wordContainsLetter('q'));
  }

  @Test
  public void replaceBlanksWithCorrectGuesses_returnBlanksArrayPopulatedWithLetter_potato() {
    HangMan testGame = new HangMan();
    List<Character> blanksArray = testGame.makeBlanksArray();
    blanksArray = testGame.replaceBlanksWithCorrectGuesses('a');
    assertEquals(Arrays.asList('-', '-', '-', 'a', '-', '-'), blanksArray);
    blanksArray = testGame.replaceBlanksWithCorrectGuesses('p');
    assertEquals(Arrays.asList('p', '-', '-', 'a', '-', '-'), blanksArray);
    blanksArray = testGame.replaceBlanksWithCorrectGuesses('o');
    assertEquals(Arrays.asList('p', 'o', '-', 'a', '-', 'o'), blanksArray);
    blanksArray = testGame.replaceBlanksWithCorrectGuesses('t');
    assertEquals(Arrays.asList('p', 'o', 't', 'a', 't', 'o'), blanksArray);
  }

  @Test
  public void checkIfArraysSame_checkCharArrayAndBlankArrayForSameness_true(){
    HangMan testGame = new HangMan();
    List<Character> charArray = testGame.getWordToArray();
    List<Character> blanksArray = testGame.makeBlanksArray();
    blanksArray = testGame.replaceBlanksWithCorrectGuesses('a');
    blanksArray = testGame.replaceBlanksWithCorrectGuesses('p');
    blanksArray = testGame.replaceBlanksWithCorrectGuesses('o');
    blanksArray = testGame.replaceBlanksWithCorrectGuesses('t');
    assertEquals(blanksArray, charArray);
  }

}
