# Copyright 2018-2020 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Packagegroup to provide necessary tools for basic core image"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS_${PN} = " \
    dosfstools \
    evtest \
    e2fsprogs-mke2fs \
    fsl-rc-local \
    fbset \
    i2c-tools \
    iproute2 \
    kernel-pcitest \
    memtester \
    python-subprocess \
    python-datetime \
    python-json \
    ethtool \
    mtd-utils \
    mtd-utils-ubifs \
    procps \
    ptpd \
    linuxptp \
    iw \
    can-utils \
    cpufrequtils \
    nano \
    ntpdate \
    minicom \
    coreutils \
    mmc-utils \
    udev-extraconf \
    e2fsprogs-resize2fs \
"
