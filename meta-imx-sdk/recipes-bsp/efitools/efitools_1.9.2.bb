require efitools.inc

DEPENDS += "efitools-native gnu-efi openssl"

EXTRA_OEMAKE:append = " \
    INCDIR_PREFIX='${STAGING_DIR_TARGET}' \
    CRTPATH_PREFIX='${STAGING_DIR_TARGET}' \
    SIGN_EFI_SIG_LIST='${STAGING_BINDIR_NATIVE}/sign-efi-sig-list' \
    CERT_TO_EFI_SIG_LIST='${STAGING_BINDIR_NATIVE}/cert-to-efi-sig-list' \
    CERT_TO_EFI_HASH_LIST='${STAGING_BINDIR_NATIVE}/cert-to-efi-hash-list' \
    HASH_TO_EFI_SIG_LIST='${STAGING_BINDIR_NATIVE}/hash-to-efi-sig-list' \
"

RDEPENDS:${PN} = " \
    parted mtools coreutils util-linux openssl libcrypto \
"

EXTRA_OEMAKE:append:class-nativesdk = " \
    INCDIR_PREFIX='${STAGING_DIR_NATIVE}' \
    CRTPATH_PREFIX='${STAGING_DIR_NATIVE}' \
"

BBCLASSEXTEND = "nativesdk"

