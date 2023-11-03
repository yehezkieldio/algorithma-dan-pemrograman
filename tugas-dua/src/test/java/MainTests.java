import static org.junit.jupiter.api.Assertions.assertEquals;

import com.elizielx.Main;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;

public class MainTests {

  @Test
  public void test_calculate_total_price_with_jeans() {
    String input = "a\n5\n";
    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    ByteArrayOutputStream out = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));

    Main.main(new String[0]);

    String expectedOutput =
        "A. Jeans. Rp 200,000.00\n"
            + "B. Lea. Rp 300,000.00\n"
            + "C. Levis. Rp 500,000.00\n"
            + "Pilih kode barang yang dibeli:\n"
            + "Masukkan jumlah barang yang dibeli: \n"
            + "Nama barang yang dibeli: Jeans\n"
            + "Jumlah barang yang dibeli: 5\n"
            + "Jumlah harga barang: Rp 200,000.00\n"
            + "Jumlah total harga: Rp 1,000,000.00\n"
            + "Besaran diskon: 5%\n"
            + "Jumlah diskon: Rp 50,000.00\n"
            + "Jumlah yang harus dibayar: Rp 950,000.00\n";

    assertEquals(expectedOutput, out.toString());
  }

  @Test
  public void test_calculate_total_price_with_lea() {
    String input = "b\n3\n";
    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    ByteArrayOutputStream out = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));

    Main.main(new String[0]);

    String expectedOutput =
        "A. Jeans. Rp 200,000.00\n"
            + "B. Lea. Rp 300,000.00\n"
            + "C. Levis. Rp 500,000.00\n"
            + "Pilih kode barang yang dibeli:\n"
            + "Masukkan jumlah barang yang dibeli: \n"
            + "Nama barang yang dibeli: Lea\n"
            + "Jumlah barang yang dibeli: 3\n"
            + "Jumlah harga barang: Rp 300,000.00\n"
            + "Jumlah total harga: Rp 900,000.00\n"
            + "Besaran diskon: 5%\n"
            + "Jumlah diskon: Rp 45,000.00\n"
            + "Jumlah yang harus dibayar: Rp 855,000.00\n";

    assertEquals(expectedOutput, out.toString());
  }

  @Test
  public void test_calculate_total_price_with_levis() {
    String input = "c\n2\n";
    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    ByteArrayOutputStream out = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));

    Main.main(new String[0]);

    String expectedOutput =
        "A. Jeans. Rp 200,000.00\n"
            + "B. Lea. Rp 300,000.00\n"
            + "C. Levis. Rp 500,000.00\n"
            + "Pilih kode barang yang dibeli:\n"
            + "Masukkan jumlah barang yang dibeli: \n"
            + "Nama barang yang dibeli: Levis\n"
            + "Jumlah barang yang dibeli: 2\n"
            + "Jumlah harga barang: Rp 500,000.00\n"
            + "Jumlah total harga: Rp 1,000,000.00\n"
            + "Besaran diskon: 5%\n"
            + "Jumlah diskon: Rp 50,000.00\n"
            + "Jumlah yang harus dibayar: Rp 950,000.00\n";

    assertEquals(expectedOutput, out.toString());
  }
}
