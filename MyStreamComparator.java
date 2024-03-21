package HW;

import java.util.Comparator;

public class MyStreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream stream1, Stream stream2) {
        return Integer.compare(stream1.size(), stream2.size());

    }

}