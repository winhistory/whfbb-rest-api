package net.winhistory.forum.web.mapper;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.bson.types.ObjectId;

public class ObjectIdMapper extends ObjectMapper {

    public static Module getModule() {
        SimpleModule module = new SimpleModule("ObjectIdModule");
        module.addSerializer(ObjectId.class, new ToStringSerializer());

        return module;
    }
}
