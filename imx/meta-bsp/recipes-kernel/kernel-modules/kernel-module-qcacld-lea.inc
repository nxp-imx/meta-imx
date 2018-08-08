SUMMARY = "Qualcomm WiFi driver for QCA module 9377 and 6174"
LICENSE = "BSD & GPLv2"
LIC_FILES_CHKSUM = "file://CORE/HDD/src/wlan_hdd_main.c;beginline=1;endline=20;md5=ec8d62116b13db773825ebf7cf91be1d;"

inherit module

FILESEXTRAPATHS_prepend := "${THISDIR}/kernel-module-qcacld-lea:"

# The following patchset are for kernel v4.14 only
SRC_URI = "git://source.codeaurora.org/external/wlan/qcacld-2.0;protocol=https;branch=CNSS.LEA.NRT_2.0; \
           file://0001-CORE-QCA9377-CLD-LEA-2.0-porting-to-support-Android-.patch \
           file://0002-Kbuild-Eliminate-errors-by-tool-chain-and-disable-de.patch \
           file://0003-dbglog_host-add-timeout-for-dbglog_block-fwlog-read.patch \
           file://0004-CORE-remove-the-debug-message-in-default.patch \
           file://0005-CORE-cannot-call-spin_lock_bh-in-irq-context.patch \
           file://0006-Kbuild-disable-QCA_CONFIG_SMP.patch \
           file://0007-LEA.NRT_2.0-fix-the-build-error.patch \
           file://0008-CORE-add-pcie-multi_if_name-support.patch \
           file://0009-CORE-add-timeout-when-BMI-request-response-transacti.patch \
           file://0010-CORE-HIF-PCIe-only-support-one-instance.patch \
           file://0011-CORE-BMI-RF-align-the-utf-firmware-bin-name.patch \
           file://0012-CORE-revert-two-patches-to-support-QCA-SMP.patch \
           file://0013-CORE-services-os-fix-issue-to-avoid-spin_lock_bh-in-.patch \
           file://0014-CLD-CORE-add-CONFIG_HDD_WLAN_WAIT_TIME-support-for-u.patch \
           file://0015-CORE-upgrade-CLD-LEA2.0-to-support-kernel-v4.14.patch \
           file://0016-CORE-wlan_hdd_cfg80211-disable-scheduled-scan-if-no-.patch \
           file://0017-CORE-HIF-enable-pcie-MSI-feature.patch \
           file://0018-MLK-18490-CORE-HDD-add-ssid-len-check.patch \
           file://0019-MLK-18491-qcacld-2.0-avoid-overflow-of-bounce-buffer.patch \
           file://0020-MLK-18491-02-qcacld-2.0-fix-the-overflow-of-bounce-b.patch \
           file://0021-CORE-LEA2.0-fix-the-initialization-from-incompatible.patch \
"

# verison v4.5.23.1
SRCREV = "af6adc6662dd2e8f5ca25af2d184faef44465b45"

S = "${WORKDIR}/git"

QCA6174_OEMAKE = "CONFIG_ROME_IF=pci CONFIG_WLAN_FEATURE_11W=y CONFIG_WLAN_FEATURE_FILS=y \
                  CONFIG_WLAN_WAPI_MODE_11AC_DISABLE=y MODNAME=qca6174"
QCA9377_OEMAKE = "CONFIG_CLD_HL_SDIO_CORE=y CONFIG_PER_VDEV_TX_DESC_POOL=1 SAP_AUTH_OFFLOAD=1 CONFIG_QCA_LL_TX_FLOW_CT=1\
                  CONFIG_WLAN_FEATURE_FILS=y CONFIG_FEATURE_COEX_PTA_CONFIG_ENABLE=y CONFIG_QCA_SUPPORT_TXRX_DRIVER_TCP_DEL_ACK=y \
                  CONFIG_WLAN_WAPI_MODE_11AC_DISABLE=y MODNAME=qca9377"

EXTRA_OEMAKE += "CONFIG_CFG80211_INTERNAL_REGDB=y CONFIG_PMF_SUPPORT=y CONFIG_LINUX_QCMBR=y"
EXTRA_OEMAKE += "TARGET_BUILD_VARIANT=user CONFIG_NON_QC_PLATFORM=y"
EXTRA_OEMAKE += "CONFIG_HDD_WLAN_WAIT_TIME=10000"
