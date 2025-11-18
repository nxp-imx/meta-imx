require recipes-bsp/uefi/edk2-firmware.inc

SRCREV_edk2           ?= "d46aa46c8361194521391aa581593e556c707c6e"
SRCREV_edk2-platforms ?= "d82aa92c1d360c1b53ccad4dc45bdd8164a560d5"

SRC_URI += "file://edk2_fix_epoch.patch"

#FIXME - arm32 doesn't work with clang due to a linker issue
TOOLCHAIN:arm = "gcc"
