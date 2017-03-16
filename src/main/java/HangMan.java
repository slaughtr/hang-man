import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class HangMan {
  private String mWord;
  private char mUserLetter;

  public HangMan(String baseWord, char userLetter) {
    mWord = baseWord;
    mUserLetter = userLetter;
  }

  public String getWord() {
    return mWord;
  }

  public char[] getWordToArray() {
    char[] charArray = mWord.toCharArray();
    return charArray;
  }

  public char[] makeBlanksArray() {
    List<char> copiedCharArray = Arrays.asList(getWordToArray());

    for (char letter : copiedCharArray) {
      letter = '-';
    }
  }

}
