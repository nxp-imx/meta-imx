DISTRO_FEATURES:append = " ima tpm2 efi-secure-boot luks modsign"

SIGNING_MODEL ??= "sample"
SAMPLE_MOK_SB_KEYS_DIR = "${BSPDIR}/sources/meta-imx/meta-imx-bsp/recipes-bsp/efitools/files/mok_sb_keys"
SAMPLE_UEFI_SB_KEYS_DIR = "${BSPDIR}/sources/meta-imx/meta-imx-bsp/recipes-bsp/efitools/files/uefi_sb_keys"
SAMPLE_SYSTEM_TRUSTED_KEYS_DIR = "${BSPDIR}/sources/meta-imx/meta-imx-bsp/recipes-bsp/efitools/files/system_trusted_keys"
SAMPLE_SECONDARY_TRUSTED_KEYS_DIR = "${BSPDIR}/sources/meta-imx/meta-imx-bsp/recipes-bsp/efitools/files/secondary_trusted_keys"
SAMPLE_MODSIGN_KEYS_DIR = "${BSPDIR}/sources/meta-imx/meta-imx-bsp/recipes-bsp/efitools/files/modsign_keys"
SAMPLE_IMA_KEYS_DIR = "${BSPDIR}/sources/meta-imx/meta-imx-bsp/recipes-bsp/efitools/files/ima_keys"
SAMPLE_RPM_KEYS_DIR = "${BSPDIR}/sources/meta-imx/meta-imx-bsp/recipes-bsp/efitools/files/rpm_keys"
SAMPLE_BOOT_KEYS_DIR = "${BSPDIR}/sources/meta-imx/meta-imx-bsp/recipes-bsp/efitools/files/boot_keys"

# Microsoft certificates
MSFT_DB_CERT = "${BSPDIR}/sources/meta-imx/meta-imx-bsp/recipes-bsp/efitools/files/uefi_sb_keys/ms-DB.crt"
MSFT_KEK_CERT = "${BSPDIR}/sources/meta-imx/meta-imx-bsp/recipes-bsp/efitools/files/uefi_sb_keys/ms-KEK.crt"

# EV certificate
EV_CERT ??= "${BSPDIR}/sources/meta-imx/meta-imx-bsp/recipes-bsp/efitools/files/mok_sb_keys/wosign_ev_cert.crt"

# Use SELoader with the UEFI shim
UEFI_SELOADER ??= "1"

# Use gpg key to protect and verify all files used by grub
GRUB_SIGN_VERIFY ??= "0"

# Signing file extension
SB_FILE_EXT = "${@'.p7b' if d.getVar('UEFI_SELOADER') == "1" else '.sig'}"

# By default the sample keys are used
MOK_SB_KEYS_DIR ??= "${SAMPLE_MOK_SB_KEYS_DIR}"
UEFI_SB_KEYS_DIR ??= "${SAMPLE_UEFI_SB_KEYS_DIR}"
SYSTEM_TRUSTED_KEYS_DIR ??= "${SAMPLE_SYSTEM_TRUSTED_KEYS_DIR}"
SECONDARY_TRUSTED_KEYS_DIR ??= "${SAMPLE_SECONDARY_TRUSTED_KEYS_DIR}"
MODSIGN_KEYS_DIR ??= "${SAMPLE_MODSIGN_KEYS_DIR}"
IMA_KEYS_DIR ??= "${SAMPLE_IMA_KEYS_DIR}"
RPM_KEYS_DIR ??= "${SAMPLE_RPM_KEYS_DIR}"
BOOT_KEYS_DIR ??= "${SAMPLE_BOOT_KEYS_DIR}"
GRUB_PUB_KEY ??= "${BOOT_KEYS_DIR}/boot_pub_key"

# Define the identification of vendor
VENDOR_UUID ??= "1f7b9654-2107-4697-8f1c-0cbc38874588"

# User configurable identification of signature owner 
UEFI_SIG_OWNER_GUID ??= "${VENDOR_UUID}"

SAMPLE_RPM_KEYNAME ??= "SecureCore"
RPM_GPG_NAME ??= "${SAMPLE_RPM_KEYNAME}"
RPM_GPG_PASSPHRASE ??= "SecureCore"
BOOT_GPG_NAME ??= "SecureBootCore"
BOOT_GPG_PASSPHRASE ??= "SecureCore"

BB_BASEHASH_IGNORE_VARS:append = " \
    SYSTEM_TRUSTED_KEYS_DIR \
    SECONDARY_TRUSTED_KEYS_DIR \
    MODSIGN_KEYS_DIR \
    IMA_KEYS_DIR \
    RPM_KEYS_DIR \
    UEFI_SB_KEYS_DIR MOK_SB_KEYS_DIR \
    EV_CERT MSFT_DB_CERT MSFT_KEK_CERT \
"

EXTRA_OEMAKE:append:class-nativesdk = " \
    INCDIR_PREFIX='${STAGING_DIR_NATIVE}' \
    CRTPATH_PREFIX='${STAGING_DIR_NATIVE}' \
"

BBCLASSEXTEND = "nativesdk"
