package com.ka.deserializer;

import com.ka.topic.Topic;
import com.sun.xml.internal.ws.encoding.soap.DeserializationException;
import org.apache.avro.io.BinaryDecoder;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificRecordBase;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Map;


/**
 * Created by zhangyu1 on 2017/5/27.
 * Avro 对象的反序列化类 AvroDeserializer
 *
 */
public class AvroDeserializer<T extends SpecificRecordBase> implements Deserializer<T> {

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
    }

    @Override
    public T deserialize(String topic, byte[] data) {

        DatumReader<T> userDatumReader = new SpecificDatumReader<>(Topic.matchFor(topic).topicType.getSchema());
        BinaryDecoder binaryEncoder = DecoderFactory.get().directBinaryDecoder(new ByteArrayInputStream(data), null);
        try {
            return userDatumReader.read(null, binaryEncoder);
        } catch (IOException e) {
            throw new DeserializationException(e.getMessage());
        }
    }

    @Override
    public void close() {

    }
}