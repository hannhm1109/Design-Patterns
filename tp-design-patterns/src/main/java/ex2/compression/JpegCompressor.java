package ex2.compression;

/**
 * @author hanane
 **/
public class JpegCompressor extends Compressor {
    @Override
    protected int[] doCompress(int[] data) {
        System.out.println("Jpeg Compressor: compress JPEG");
        return data;
    }
}
