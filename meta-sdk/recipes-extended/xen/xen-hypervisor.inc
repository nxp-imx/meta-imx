SUMMARY = "Xen hypervisor"
DESCRIPTION = "The Xen hypervisor"

# This recipe is for just the Xen hypervisor.
# Separate recipes are used to build Xen and its components:
# this allows for varying the target architecture or toolchain used
# to build the different components. eg. 32-bit tools and a 64-bit hypervisor.

# The Xen hypervisor has a narrower compatible platform range than the Xen tools
COMPATIBLE_HOST = '(x86_64.*).*-linux|aarch64.*-linux|arm-.*-linux-gnueabi'

inherit deploy python3native cml1

PACKAGES = " \
    ${PN} \
    ${PN}-dbg \
    ${PN}-efi \
    "

FILES_${PN} = " \
    /boot/xen-* \
    /boot/xen \
    /boot/xen-*.gz \
    /boot/xen.gz \
    /boot/xen-syms-* \
    "

FILES_${PN}-dbg += "${libdir}/debug/*"

FILES_${PN}-efi = " \
    /boot/xen.efi \
    ${exec_prefix}/lib64/efi/xen* \
    "

do_configure() {
    do_configure_common

    # Handle the config fragments
    cfgs="${@' '.join(find_cfgs(d))}"
    if [ -n "${cfgs}" ]; then
        # If .config is not present generate one in order
        # to use the merge_config.sh
        if [ ! -f "${S}/xen/.config" ] ; then
            oe_runmake -C ${S}/xen defconfig
        fi
        ${S}/xen/tools/kconfig/merge_config.sh -m -O \
            ${S}/xen ${S}/xen/.config "${cfgs}"
    fi
}

do_compile() {
    oe_runmake xen PYTHON="${PYTHON}"
}

do_install() {
    oe_runmake DESTDIR="${D}" install-xen
}

do_deploy() {
    install -d ${DEPLOYDIR}

    if [ -f ${B}/xen/xen ]; then
        install -m 0644 ${B}/xen/xen ${DEPLOYDIR}/xen-${MACHINE}
    fi

    if [ -f ${B}/xen/xen.gz ]; then
        install -m 0644 ${B}/xen/xen.gz ${DEPLOYDIR}/xen-${MACHINE}.gz
    fi

    if [ -f ${B}/xen/xen.efi ]; then
        install -m 0644 ${B}/xen/xen.efi ${DEPLOYDIR}/xen-${MACHINE}.efi
    fi
}
# Scheduling the do_deploy task:
# - deploy copies files from ${B} that are written during do_compile so must
#   at least run afer that task has completed
# - the hypervisor binaries may be included in the image filesystem, so we
#   must ensure that the binaries deployed match what is staged in the sysroot:
#   so do deploy must run after do_populate_sysroot -- which is always after
#   do_compile, so that handles 'after do_compile' too
# - add the task before do_build to ensure that deployment has completed when
#   the recipe build done stamp is written
addtask deploy after do_populate_sysroot before do_build
# To ensure that a deployed hypervisor has matching tools, add a dependency to
# make sure that the tools have built and been staged:
do_deploy[depends] += "xen-tools:do_populate_sysroot"
# Also ensure anything that the tools recipe needs to deploy, such as a
# XSM policy file, has been deployed first:
do_deploy[depends] += "xen-tools:do_deploy"

# Enable use of menuconfig directly from bitbake and also within the devshell
do_devshell[depends] += "ncurses-native:do_populate_sysroot"

# Pass the native library path for kconfig build when running the do_menuconfig
# task
CROSS_CURSES_LIB += "-L${STAGING_LIBDIR_NATIVE}"

# Specify the root dir of the .config file for do_menuconfig and do_diffconfig
# tasks
KCONFIG_CONFIG_ROOTDIR = "${S}/xen"
