require kernel-module-qcacld-lea.inc

SUMMARY = "Qualcomm WiFi driver for QCA module 9377"

EXTRA_OEMAKE += "${QCA9377_OEMAKE}"

#Remove the patch which is not for Qualcomm qca9377
SRC_URI_remove = "file://0020-MLK-18491-02-qcacld-2.0-fix-the-overflow-of-bounce-b.patch"
