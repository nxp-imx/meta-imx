SUMMARY = "Qualcomm WiFi driver module for LEA, including QCA6174A"
LICENSE = "BSD & GPLv2"
LIC_FILES_CHKSUM = "file://CORE/HDD/src/wlan_hdd_main.c;beginline=1;endline=20;md5=24d7922bbfe4c4ca1f62767a678ebdfa;"

inherit module

SRC_URI = "git://source.codeaurora.org/quic/la/platform/vendor/qcom-opensource/wlan/qcacld-2.0;protocol=https;branch=caf-wlan/CNSS.LEA.NRT_1.0; \
           file://0001-Kbuild-Eliminate-errors-by-tool-chain-and-disable-de.patch  \
           file://0002-LEA.NRT_1.0-fix-the-build-error.patch \
"

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

EXTRA_OEMAKE += "CONFIG_NON_QC_PLATFORM=y CONFIG_ROME_IF=pci"
