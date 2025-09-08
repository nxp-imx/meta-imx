PACKAGECONFIG[ALL] = "-F all-providers -F cryptoki/generate-bindings -F tss-esapi/generate-bindings,,tpm2-tss libts,tpm2-tss libtss2-tcti-device libts"
PACKAGECONFIG[TPM] = "-F tpm-provider -F tss-esapi/generate-bindings,,tpm2-tss,tpm2-tss libtss2-tcti-device"
PACKAGECONFIG[PKCS11] = "-F pkcs11-provider -F cryptoki/generate-bindings,"
PACKAGECONFIG[MBED-CRYPTO] = "-F mbed-crypto-provider,"
PACKAGECONFIG[CRYPTOAUTHLIB] = "-F cryptoauthlib-provider,"
PACKAGECONFIG[TS] = "-F trusted-service-provider,,libts,libts"

PARSEC_FEATURES = ""
CARGO_BUILD_FLAGS:remove = "--features"
