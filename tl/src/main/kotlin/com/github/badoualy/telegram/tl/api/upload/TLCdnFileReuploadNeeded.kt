package com.github.badoualy.telegram.tl.api.upload

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.computeTLBytesSerializedSize
import com.github.badoualy.telegram.tl.core.TLBytes
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * upload.cdnFileReuploadNeeded#eea8e46e
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLCdnFileReuploadNeeded() : TLAbsCdnFile() {
    var requestToken: TLBytes = TLBytes.EMPTY

    private val _constructor: String = "upload.cdnFileReuploadNeeded#eea8e46e"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(requestToken: TLBytes) : this() {
        this.requestToken = requestToken
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeTLBytes(requestToken)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        requestToken = readTLBytes()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += computeTLBytesSerializedSize(requestToken)
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLCdnFileReuploadNeeded) return false
        if (other === this) return true

        return requestToken == other.requestToken
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xeea8e46e.toInt()
    }
}