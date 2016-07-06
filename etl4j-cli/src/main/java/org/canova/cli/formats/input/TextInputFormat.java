package org.canova.cli.formats.input;


import org.etl4j.api.conf.Configuration;
import org.etl4j.api.formats.input.BaseInputFormat;
import org.etl4j.api.records.reader.RecordReader;

import org.etl4j.api.split.InputSplit;
import org.canova.cli.records.reader.LineRecordReader;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;


public class TextInputFormat extends BaseInputFormat {
	
    @Override
    public RecordReader createReader(InputSplit split, Configuration conf) throws IOException, InterruptedException {
        return createReader(split);
    }

    @Override
    public RecordReader createReader(InputSplit split) throws IOException, InterruptedException {
        LineRecordReader ret = new LineRecordReader();
        ret.initialize(split);
        return ret;

    }

    @Override
    public void write(DataOutput out) throws IOException {

    }

    @Override
    public void readFields(DataInput in) throws IOException {

    }

}
