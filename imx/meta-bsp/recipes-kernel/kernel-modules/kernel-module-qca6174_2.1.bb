require kernel-module-qcacld-lea.inc

SUMMARY = "Qualcomm WiFi driver for QCA module 6174"

SRC_URI += "file://0001-MLK-18491-02-qcacld-2.0-fix-the-overflow-of-bounce-b.patch"

EXTRA_OEMAKE += "${QCA6174_OEMAKE}"
