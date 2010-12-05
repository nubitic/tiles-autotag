package org.apache.tiles.autotag.jsp;

import java.io.File;
import java.util.Map;

import org.apache.tiles.autotag.generate.AbstractTemplateClassGenerator;
import org.apache.tiles.autotag.model.TemplateClass;
import org.apache.tiles.autotag.model.TemplateSuite;
import org.apache.velocity.app.VelocityEngine;

public class TagClassGenerator extends AbstractTemplateClassGenerator {

    public TagClassGenerator(VelocityEngine velocityEngine) {
        super(velocityEngine);
    }

    @Override
    protected String getDirectoryName(File directory, String packageName,
            TemplateSuite suite, TemplateClass clazz, Map<String, String> parameters) {
        return packageName.replaceAll("\\.", "/");
    }

    @Override
    protected String getFilename(File directory, String packageName,
            TemplateSuite suite, TemplateClass clazz, Map<String, String> parameters) {
        return clazz.getTagClassPrefix() + "Tag.java";
    }

    @Override
    protected String getTemplatePath(File directory, String packageName,
            TemplateSuite suite, TemplateClass clazz, Map<String, String> parameters) {
        return "/org/apache/tiles/autotag/jsp/bodyTag.vm";
    }
}
