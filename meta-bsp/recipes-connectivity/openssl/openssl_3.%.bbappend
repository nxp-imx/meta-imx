SRC_URI += "file://openssl-3.0-add-Kernel-TLS-configuration.patch"

EXTRA_OECONF:append = " enable-ktls"
