package ex2.compression;

/**
 * @author hanane
 **/
public class PngCompressor extends Compressor {
    @Override
    protected int[] doCompress(int[] data) {
        System.out.println("Png Compressor: compress PNG");
        return data;
    }
}
