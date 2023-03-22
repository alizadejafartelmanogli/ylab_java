package homework03.FileSort;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Sorter {

    public File sortFile(File dataFile) throws IOException {
        long[] countMassive;
        try (Scanner scanner = new Scanner(new FileInputStream(dataFile))) {
            List<Long> countList = new ArrayList<>();
            while (scanner.hasNextLong()) {
                countList.add(scanner.nextLong());
            }
            scanner.close();
            countMassive = new long[countList.size()];
            for (int i = 0; i < countMassive.length; i++) {
                countMassive[i] = countList.get(i);
            }
            countList.clear();
            countMassive = sortMassive(countMassive);
        }
        File file = new File(dataFile.getName());
        try (PrintWriter pw = new PrintWriter(file)) {
            for (long count : countMassive) {
                pw.println(count);
            }
            pw.flush();
        }
        return file;
    }

    private long[] sortMassive(long[] massive) {
        if (massive == null) {
            return null;
        }
        if (massive.length < 2) {
            return massive;
        }
        long[] massive01 = new long[massive.length / 2];
        System.arraycopy(massive, 0, massive01, 0, massive.length / 2);
        long[] massive02 = new long[massive.length - massive.length / 2];
        System.arraycopy(massive, massive.length / 2, massive02, 0, massive.length - massive.length / 2);
        massive01 = sortMassive(massive01);
        massive02 = sortMassive(massive02);
        return mergeMassive(massive01, massive02);
    }

    private long[] mergeMassive(long[] massive01, long[] massive02) {
        long[] massive = new long[massive01.length + massive02.length];
        int positionMassive01 = 0;
        int positionMassive02 = 0;

        for (int i = 0; i < massive.length; i++) {
            if (positionMassive01 == massive01.length) {
                massive[i] = massive02[positionMassive02];
                positionMassive02++;
            } else if (positionMassive02 == massive02.length) {
                massive[i] = massive01[positionMassive01];
                positionMassive01++;
            } else if (massive01[positionMassive01] < massive02[positionMassive02]) {
                massive[i] = massive01[positionMassive01];
                positionMassive01++;
            } else {
                massive[i] = massive02[positionMassive02];
                positionMassive02++;
            }
        }
        return massive;
    }
}

