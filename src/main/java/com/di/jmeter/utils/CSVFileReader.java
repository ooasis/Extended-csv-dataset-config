/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.di.jmeter.utils;

import java.util.ArrayList;
import java.util.List;

public class CSVFileReader {

    private static CSVFileReader instance = null;
    private static List<String> list = new ArrayList<String>();
    private static int autoAllocateBlockSize;


    public static CSVFileReader getInstance(){
        if(instance == null){
            instance = new CSVFileReader();
        }
        return instance;
    }

    public static List<String> getList() {
        return list;
    }

    public static int getListSize(){
        return list.size();
    }

    public static void addToList(String line){
        CSVFileReader.list.add(line);
    }

    public String getFromList(int index) {
        return CSVFileReader.list.get(index);
    }

    public static void removeList() {
        CSVFileReader.list.clear();
    }
}
