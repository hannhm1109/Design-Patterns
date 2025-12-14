package ex2.framework;

import ex2.compression.Compressor;
import ex2.filter.FilterStrategy;

/**
 * @author hanane
 **/
public class ImageFramework {
    private FilterStrategy filterStrategy;
    private Compressor compressor;

    public ImageFramework(FilterStrategy filterStrategy, Compressor compressor) {
        this.filterStrategy = filterStrategy;
        this.compressor = compressor;
    }

    public void setFilterStrategy(FilterStrategy filterStrategy) {
        this.filterStrategy = filterStrategy;
    }

    public void setCompressor(Compressor compressor) {
        this.compressor = compressor;
    }

    public int[] filter(int[] data) {
        if (filterStrategy == null) {
            throw new IllegalStateException("FilterStrategy non configuré");
        }
        return filterStrategy.filter(data);
    }

    public int[] compresser(int[] data) {
        if (compressor == null) {
            throw new IllegalStateException("Compressor non configuré");
        }
        return compressor.compress(data);
    }
}
