package com.builderPatternDemo;

import com.builderPatternDemo.builder.Builder;
import com.builderPatternDemo.director.KFCWaiter;
import com.builderPatternDemo.utils.XMLUtils;

public class BuilderPatternClient {
    public static void main(String[] args) {
        Builder builder = (Builder) XMLUtils.getBeans();
        KFCWaiter director = new KFCWaiter(builder);
        director.construct();
    }
}
