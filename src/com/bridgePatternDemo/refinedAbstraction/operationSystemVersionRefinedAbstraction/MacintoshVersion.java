package com.bridgePatternDemo.refinedAbstraction.operationSystemVersionRefinedAbstraction;

import com.bridgePatternDemo.abstraction.OperationSystemVersion;

public class MacintoshVersion extends OperationSystemVersion {
    private static String osType = "Macintosh Operation System";

    @Override
    public void play(String fileName) {
        videoFile.decode(osType, fileName);
    }
}
