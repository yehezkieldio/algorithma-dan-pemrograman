import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.elizielx.Main;

public class MainTests {
    @Test
    public void test_user_inputs_valid_option_a() {
        String input = "A";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Main.main(new String[] {});

        String actualOutput = outContent.toString().trim();
        String expectedOutput = "Kode barang yang dipilih: a";

        assertTrue(actualOutput.contains(expectedOutput));

        System.setIn(System.in);
        System.setOut(originalOut);
    }
}
