package com.example.demo.util;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.lang.invoke.SerializedLambda;
import java.nio.charset.Charset;
import java.util.List;


@Configuration
public class fastJsonConfig  extends WebMvcConfigurationSupport {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters){
        FastJsonHttpMessageConverter converter=new FastJsonHttpMessageConverter();
        FastJsonConfig config=new FastJsonConfig();
        config.setSerializerFeatures(
                //保留map空字段
                SerializerFeature.WriteMapNullValue,
                //string类型的null 转换为""
                SerializerFeature.WriteNullStringAsEmpty,
                //number类型的null转换为0
                SerializerFeature.WriteNullNumberAsZero,
                //List类型null转为[]
                SerializerFeature.WriteNullListAsEmpty,

                SerializerFeature.WriteNullBooleanAsFalse,
                //避免循环引用
                SerializerFeature.DisableCircularReferenceDetect);
        converter.setFastJsonConfig(config);
        converter.setDefaultCharset(Charset.forName("UTF-8"));
        converters.add(converter);










    }


}
