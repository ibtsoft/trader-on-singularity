package com.ibtsoft.trader.main;

import com.ibtsoft.singularity.core.Singularity;
import com.ibtsoft.trader.model.client.Client;

public class Main {

    public static void main(String[] args) {
        Singularity s = new Singularity();
        s.addModelPackage("com.ibtsoft.trader.model");
        Client c = new Client();
    }

}
