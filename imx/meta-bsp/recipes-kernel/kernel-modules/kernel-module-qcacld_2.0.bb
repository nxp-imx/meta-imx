SUMMARY = "Qualcomm WiFi driver module for QCA9377, compatible with 4.9 kernel"
LICENSE = "BSD & GPLv2"
LIC_FILES_CHKSUM = "file://CORE/HDD/src/wlan_hdd_main.c;beginline=1;endline=20;md5=24d7922bbfe4c4ca1f62767a678ebdfa;"

inherit module

SRC_URI = "git://source.codeaurora.org/quic/la/platform/vendor/qcom-opensource/wlan/qcacld-2.0;protocol=https;branch=caf-wlan/CNSS.LEH_TF.2.3.3; \
           file://0001-Kbuild-Eliminate-errors-caused-by-GCC-6.x-warning.patch \
           file://0002-Kbuild-disable-debug-configs-in-default.patch \
"

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

EXTRA_OEMAKE += "CONFIG_CLD_HL_SDIO_CORE=y CONFIG_NON_QC_PLATFORM=y"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.
