package com.github.badoualy.telegram.tl.api

/**
 * messageActionScreenshotTaken#4792929b
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLMessageActionScreenshotTaken : TLAbsMessageAction() {
    private val _constructor: String = "messageActionScreenshotTaken#4792929b"

    override val constructorId: Int = CONSTRUCTOR_ID

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLMessageActionScreenshotTaken) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x4792929b.toInt()
    }
}