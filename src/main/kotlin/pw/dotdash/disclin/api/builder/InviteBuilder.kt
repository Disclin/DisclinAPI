package pw.dotdash.disclin.api.builder

interface InviteBuilder {

    /**
     * The duration of the invite (in seconds) before expiry, or 0@param for never.
     *
     * Default: 86400 (24 hours).
     */
    var maxAge: Int

    /**
     * The maximum number of uses, or 0 for unlimited.
     *
     * Default: 0
     */
    var maxUses: Int

    /**
     * Whether this invite only grants temporary membership.
     *
     * Default: false
     */
    var temporary: Boolean

    /**
     * If true, do not try to reuse a similar invite.
     *
     * Default: false
     */
    var unique: Boolean
}