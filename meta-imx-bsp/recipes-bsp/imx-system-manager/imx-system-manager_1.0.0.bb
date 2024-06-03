SUMMARY = "i.MX System Manager Firmware"
DESCRIPTION = "\
The System Manager (SM) is a firmware that runs on a Cortex-M processor on \
many NXP i.MX processors. The Cortex-M is the boot core, runs the boot ROM \
which loads the SM (and other boot code), and then branches to the SM. The \
SM then configures some aspects of the hardware such as isolation mechanisms \
and then starts other cores in the system. After starting these cores, it \
enters a service mode where it provides access to clocking, power, sensor, \
and pin control via a client RPC API based on ARM's System Control and \
Management Interface (SCMI)."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=0858ec9c7a80c4a2cf16e4f825a2cc91"

SRC_URI = "${IMX_SYSTEM_MANAGER_SRC};branch=${SRCBRANCH}"
IMX_SYSTEM_MANAGER_SRC ?= "git://github.com/nxp-imx/imx-sm.git;protocol=https"
SRCBRANCH = "master"
SRCREV = "86d102bbd179cda6d770efcf40ccc64d2bc108af"

S = "${WORKDIR}/git"

require imx-system-manager.inc
