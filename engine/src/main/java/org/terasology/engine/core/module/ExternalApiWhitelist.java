/*
 * Copyright 2016 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.engine.core.module;


import com.google.common.collect.ImmutableSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.terasology.persistence.typeHandling.SpecificTypeHandlerFactory;
import org.terasology.persistence.typeHandling.StringRepresentationTypeHandler;
import org.terasology.reflection.MappedContainer;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;

public final class ExternalApiWhitelist {
    private static final Set<String> NUI_PACKAGES = new ImmutableSet.Builder<String>()
            .add("org.terasology.input")
            .add("org.terasology.input.device")
            .add("org.terasology.input.device.nulldevices")
            .add("org.terasology.nui")
            .add("org.terasology.nui.asset")
            .add("org.terasology.nui.asset.font")
            .add("org.terasology.nui.canvas")
            .add("org.terasology.nui.databinding")
            .add("org.terasology.nui.events")
            .add("org.terasology.nui.itemRendering")
            .add("org.terasology.nui.layouts")
            .add("org.terasology.nui.layouts.miglayout")
            .add("org.terasology.nui.layouts.relative")
            .add("org.terasology.nui.properties")
            .add("org.terasology.nui.reflection")
            .add("org.terasology.nui.skin")
            .add("org.terasology.nui.translate")
            .add("org.terasology.nui.util")
            .add("org.terasology.nui.widgets")
            .add("org.terasology.nui.widgets.treeView")
            .add("org.terasology.nui.widgets.types")
            .add("org.terasology.nui.widgets.types.builtin")
            .add("org.terasology.nui.widgets.types.builtin.object")
            .add("org.terasology.nui.widgets.types.builtin.util")
            .add("org.terasology.nui.widgets.types.math")
            .add("org.terasology.reflection.metadata")
            .build();

    private static final Set<Class<?>> NUI_CLASSES = new ImmutableSet.Builder<Class<?>>()
            .add(org.terasology.input.device.InputDevice.class)
            .add(org.terasology.input.device.KeyboardDevice.class)
            .add(org.terasology.input.device.MouseDevice.class)
            .add(org.terasology.reflection.MappedContainer.class)
            .add(org.terasology.reflection.TypeInfo.class)
            .build();

    public static final Set<String> PACKAGES = new ImmutableSet.Builder<String>()
            .addAll(NUI_PACKAGES)
            .add("org.terasology.math")
            .add("org.terasology.math.geom")
            .add("org.terasology.joml.geom")
            .add("java.lang")
            .add("java.beans")
            .add("java.lang.invoke")
            .add("java.lang.ref")
            .add("java.math")
            .add("java.util")
            .add("java.util.concurrent")
            .add("java.util.concurrent.atomic")
            .add("java.util.concurrent.locks")
            .add("java.util.function")
            .add("java.util.regex")
            .add("java.util.stream")
            .add("java.util.zip")
            .add("java.awt")
            .add("java.awt.geom")
            .add("java.awt.image")
            .add("jdk.internal.reflect")
            .add("com.google.common.annotations")
            .add("com.google.common.cache")
            .add("com.google.common.collect")
            .add("com.google.common.base")
            .add("com.google.common.math")
            .add("com.google.common.primitives")
            .add("com.google.common.util.concurrent")
            .add("gnu.trove")
            .add("gnu.trove.decorator")
            .add("gnu.trove.function")
            .add("gnu.trove.iterator")
            .add("gnu.trove.iterator.hash")
            .add("gnu.trove.list")
            .add("gnu.trove.list.array")
            .add("gnu.trove.list.linked")
            .add("gnu.trove.map")
            .add("gnu.trove.map.hash")
            .add("gnu.trove.map.custom_hash")
            .add("gnu.trove.procedure")
            .add("gnu.trove.procedure.array")
            .add("gnu.trove.queue")
            .add("gnu.trove.set")
            .add("gnu.trove.set.hash")
            .add("gnu.trove.stack")
            .add("gnu.trove.stack.array")
            .add("gnu.trove.strategy")
            .add("javax.vecmath")
            .add("com.yourkit.runtime")
            .add("com.bulletphysics.linearmath")
            .add("sun.reflect")
            .add("com.snowplowanalytics.snowplow.tracker.events")
            .add("com.snowplowanalytics.snowplow.tracker.payload")
            .add("org.lwjgl.opengl")
            .add("org.lwjgl.opengl.GL11")
            .add("org.lwjgl.opengl.GL12")
            .add("org.lwjgl.opengl.GL13")
            .add("org.lwjgl")
            .add("org.terasology.jnlua")
            .add("org.joml")
            .add("org.terasology.input")
            .add("org.terasology.input.device")
            .add("org.terasology")
            .build();

    public static final Set<Class<?>> CLASSES = new ImmutableSet.Builder<Class<?>>()
            .addAll(NUI_CLASSES)
            .add(com.esotericsoftware.reflectasm.MethodAccess.class)
            .add(InvocationTargetException.class)
            .add(LoggerFactory.class)
            .add(Logger.class)
            .add(java.awt.datatransfer.UnsupportedFlavorException.class)
            .add(java.nio.ByteBuffer.class)
            .add(java.nio.ShortBuffer.class)
            .add(java.nio.IntBuffer.class)
            .add(java.nio.FloatBuffer.class)
            .add(java.nio.file.attribute.FileTime.class) // java.util.zip dependency
            // This class only operates on Class<?> or Object instances,
            // effectively adding a way to access arrays without knowing their type
            // beforehand. It's safe despite being in java.lang.reflect.
            .add(java.lang.reflect.Array.class)
            .add(java.io.DataInput.class)
            .add(java.io.DataOutput.class)
            .add(java.io.EOFException.class)
            .add(java.io.FileNotFoundException.class)
            .add(java.io.IOException.class)
            .add(java.io.UTFDataFormatException.class)
            /* All sorts of readers */
            .add(java.io.Reader.class)
            .add(java.io.BufferedReader.class)
            .add(java.io.FilterReader.class)
            .add(java.io.InputStreamReader.class)
            .add(java.io.PipedReader.class)
            .add(java.io.StringReader.class)
            /* All sorts of writers */
            .add(java.io.Writer.class)
            .add(java.io.BufferedWriter.class)
            .add(java.io.FilterWriter.class)
            .add(java.io.OutputStreamWriter.class)
            .add(java.io.PipedWriter.class)
            .add(java.io.StringWriter.class)
            /* All sorts of input streams */
            .add(java.io.InputStream.class)
            .add(java.io.BufferedInputStream.class)
            .add(java.io.ByteArrayInputStream.class)
            .add(java.io.DataInputStream.class)
            .add(java.io.FilterInputStream.class)
            .add(java.io.PipedInputStream.class)
            .add(java.io.PushbackInputStream.class)
            /* All sorts of output streams */
            .add(java.io.OutputStream.class)
            .add(java.io.BufferedOutputStream.class)
            .add(java.io.ByteArrayOutputStream.class)
            .add(java.io.DataOutputStream.class)
            .add(java.io.FilterOutputStream.class)
            .add(java.io.PipedOutputStream.class)
            // terasology math
            .add(org.terasology.math.TeraMath.class)
            // gestalt module
            .add(org.terasology.gestalt.naming.Name.class)
            .add(org.terasology.gestalt.assets.management.AssetManager.class)
            .add(org.terasology.gestalt.assets.Asset.class)
            .add(org.terasology.gestalt.assets.AssetData.class)
            .add(org.terasology.gestalt.assets.AssetDataProducer.class)
            .add(org.terasology.gestalt.assets.module.annotations.RegisterAssetDataProducer.class)
            .add(MappedContainer.class)
            .add(StringRepresentationTypeHandler.class)
            .add(SpecificTypeHandlerFactory.class)
            .add(org.terasology.gestalt.assets.ResourceUrn.class)
            .add(org.terasology.reflection.metadata.FieldMetadata.class)
            .build();

    private ExternalApiWhitelist() {
    }
}
