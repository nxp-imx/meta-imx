# Copyright 2018-2020,2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Packagegroup to provide necessary tools for basic core image"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

KERNEL_TEST_TOOLS      = "kernel-tools-iio kernel-tools-pci spidev-test"
KERNEL_TEST_TOOLS:mx8m-nxp-bsp = "kernel-tools-iio kernel-tools-pci spidev-test kernel-tools-virtio"


RDEPENDS:${PN} = " \
    can-utils \
    coreutils \
    cpufrequtils \
    dosfstools \
    ethtool \
    evtest \
    e2fsprogs-mke2fs \
    e2fsprogs-resize2fs \
    fbset \
    fsl-rc-local \
    iproute2 \
    iw \
    i2c-tools \
    ${KERNEL_TEST_TOOLS} \
    libgpiod-tools \
    linuxptp \
    memtester \
    minicom \
    mmc-utils \
    mtd-utils \
    mtd-utils-ubifs \
    nano \
    parted \
    pipewire \
    pipewire-spa-tools \
    pipewire-tools \
    pipewire-pulse \
    pipewire-v4l2 \
    procps \
    ptpd \
    ntp \
    python3-core \
    python3-datetime \
    python3-json \
    udev-extraconf \
"
