/*
 * YGuard -- an obfuscation library for Java(TM) classfiles.
 *
 * Original Copyright (c) 1999 Mark Welsh (markw@retrologic.com)
 * Modifications Copyright (c) 2002 yWorks GmbH (yguard@yworks.com)
 *
 */
package com.yworks.yguard.obf.classfile;

/**
 * Representation of a 'fieldref' entry in the ConstantPool.
 *
 * @author Mark Welsh
 */
public class FieldrefCpInfo extends RefCpInfo
{
    // Constants -------------------------------------------------------------


    // Fields ----------------------------------------------------------------


    // Class Methods ---------------------------------------------------------


    /**
     * Instantiates a new Fieldref cp info.
     */
    protected FieldrefCpInfo()
    {
        super(CONSTANT_Fieldref);
    }

    // Instance Methods ------------------------------------------------------
}
