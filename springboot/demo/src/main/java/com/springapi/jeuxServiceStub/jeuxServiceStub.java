package com.springapi.jeuxServiceStub;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

import com.springapi.models.jeux;

public class jeuxServiceStub {
    private static HashMap<Long, jeux> jeux = new HashMap<>();
    private static long index = 100;

    static {
        jeux jeux1 = new jeux(1, "1111", "jeux1");
        jeux jeux2 = new jeux(2, "2222", "jeux2");
        jeux.put((long) 1L, jeux1);
        jeux.put((long) 2L, jeux2);

    }

    public static List<jeux> getAlljeux() {
        return new ArrayList<>(jeux.values());
    }

    public static jeux getjeuxDetails(long jeuxid) {
        return jeux.get(jeuxid);
    }

    public static jeux addjeux(jeux jeux) {
        index += 1;
        jeux.setId(index);

        return jeux;
    }

    public static jeux updateJeux(long jeuxid, jeux jeux) {
        jeux.setId(jeuxid);
        return jeux;

    }

    public static jeux deleteJeux(long jeuxid) {
        return jeux.remove(jeuxid);
    }
}