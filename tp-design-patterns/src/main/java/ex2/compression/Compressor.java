package ex2.compression;

/**
 * @author hanane
 **/
public abstract class Compressor {
    public final int[] compress(int[] input) {
        int [] prepared = preprocess(input);
        int[] compressed = doCompress(prepared);
        return postprocess(compressed);
    }
    protected int[] preprocess(int[] data) {
        return data;
    }

    protected abstract int[] doCompress(int[] data);

    protected int[] postprocess(int[] data) {
        return data;
    }
}
