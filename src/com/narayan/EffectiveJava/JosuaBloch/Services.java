package com.narayan.EffectiveJava.JosuaBloch;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

public class Services{
    private Services() {
    }

    private static final Map<String , Provider> providers =
            new ConcurrentMap <String, Provider>(){
                @Override
                public Provider putIfAbsent(String key, Provider value) {
                    return null;
                }

                @Override
                public boolean remove(Object key, Object value) {
                    return false;
                }

                @Override
                public boolean replace(String key, Provider oldValue, Provider newValue) {
                    return false;
                }

                @Override
                public Provider replace(String key, Provider value) {
                    return null;
                }

                @Override
                public int size() {
                    return 0;
                }

                @Override
                public boolean isEmpty() {
                    return false;
                }

                @Override
                public boolean containsKey(Object key) {
                    return false;
                }

                @Override
                public boolean containsValue(Object value) {
                    return false;
                }

                @Override
                public Provider get(Object key) {
                    return null;
                }

                @Override
                public Provider put(String key, Provider value) {
                    return null;
                }

                @Override
                public Provider remove(Object key) {
                    return null;
                }

                @Override
                public void putAll(Map <? extends String, ? extends Provider> m) {

                }

                @Override
                public void clear() {

                }

                @Override
                public Set<String> keySet() {
                    return null;
                }

                @Override
                public Collection<Provider> values() {
                    return null;
                }

                @Override
                public Set <Entry <String, Provider>> entrySet() {
                    return null;
                }
            };
    public static final String DEFAULT_PROVIDER_NAME = "<DEF>";

    public static void  registerDefaultProvider(String defaultProviderName, Provider p) {
        registerDefaultProvider(DEFAULT_PROVIDER_NAME , p);
    }
}
