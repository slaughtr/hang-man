import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class HangManTest {

  @Test
  public void newHangman_instantiatesCorrectly_true(){
    HangMan testGame = new HangMan("potato", 'a');
    assertEquals(true, testGame instanceof HangMan);
  }

  @Test
  public void getWord_returnString_true(){
    HangMan testGame = new HangMan("potato", 'a');
    String gotWord = testGame.getWord();
    assertEquals(true, gotWord instanceof String);
  }

  @Test
  public void getWordToArray_returnCharArray_true(){
    HangMan testGame = new HangMan("potato", 'a');
    List<Character> charArray = testGame.getWordToArray();
    assertEquals(true, charArray.equals(Arrays.asList('p', 'o', 't', 'a', 't', 'o')));
  }

  @Test
  public void makeBlanksArray_returnArraySameLengthAsCharArray_true(){
    HangMan testGame = new HangMan("potato", 'a');
    List<Character> charArray = testGame.getWordToArray();
    List<Character> blanksArray = testGame.makeBlanksArray();
    assertEquals(true, charArray.size() == blanksArray.size());
  }

  @Test
  public void makeBlanksArray_returnBlanksArraySameLengthAsCharArray_true(){
    HangMan testGame = new HangMan("potato", 'a');
    List<Character> blanksArray = testGame.makeBlanksArray();
    assertEquals(Arrays.asList('-', '-', '-', '-', '-', '-'), blanksArray);
  }

  @Test
  public void wordContainsLetter_returnTrueIfWordContainsLetter_true(){
    HangMan testGame = new HangMan("potato", 'a');
    assertEquals(true, testGame.wordContainsLetter());
  }

  @Test
  public void wordContainsLetter_returnFalseIfWordDoesNotContainLetter_false(){
    HangMan testGame = new HangMan("potato", 'q');
    assertEquals(false, testGame.wordContainsLetter());
  }

  @Test
  public void replaceBlanksWithCorrectGuesses_returnBlanksArrayPopulatedWithLetter_blanksABlanks() {
    HangMan testGame = new HangMan("potato", 'a');
    List<Character> blanksArray = testGame.makeBlanksArray();
    blanksArray = testGame.replaceBlanksWithCorrectGuesses();
    assertEquals(Arrays.asList('-', '-', '-', 'a', '-', '-'), blanksArray);
  }

}
