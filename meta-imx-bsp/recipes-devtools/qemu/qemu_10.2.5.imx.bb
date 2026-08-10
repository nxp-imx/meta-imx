BBCLASSEXTEND = "nativesdk"

require qemu-imx.inc

DEPENDS += "glib-2.0 zlib pixman"

DEPENDS:append:libc-musl = " libucontext"

CFLAGS += "${@bb.utils.contains('DISTRO_FEATURES', 'x11', '', '-DEGL_NO_X11=1', d)}"

RDEPENDS:${PN}-common:class-target += "bash"

EXTRA_OECONF:append:class-target = " --target-list=${@get_qemu_target_list(d)}"
EXTRA_OECONF:append:class-target:mipsarcho32 = "${@bb.utils.contains('BBEXTENDCURR', 'multilib', ' --disable-capstone', '', d)}"
EXTRA_OECONF:append:class-nativesdk = " --target-list=${@get_qemu_target_list(d)}"
# nativesdk-qemu has neither the 'vhost' nor 'xen' PACKAGECONFIG enabled, but
# QEMU's vhost_user/vhost_kernel/vhost_vdpa meson options default to 'auto' and
# auto-enable on a Linux build host. That pulls in hw/virtio/vhost.c which
# references xen_mr_is_grants(); with xen disabled only xen_stubs.c is built and
# it lacks that stub, causing an undefined-reference link failure. vhost is not
# needed for the SDK host tools, so disable it explicitly.
EXTRA_OECONF:append:class-nativesdk = " --disable-vhost-user --disable-vhost-kernel --disable-vhost-vdpa"

PACKAGECONFIG ??= " \
    fdt sdl kvm pie slirp \
    ${@bb.utils.filter('DISTRO_FEATURES', 'alsa pulseaudio xen', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'virglrenderer epoxy', '', d)} \
    ${@bb.utils.filter('DISTRO_FEATURES', 'seccomp', d)} \
"
PACKAGECONFIG:class-nativesdk ??= "fdt sdl kvm pie slirp \
    ${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'virglrenderer epoxy', '', d)} \
"
# ppc32 hosts are no longer supported in qemu
COMPATIBLE_HOST:powerpc = "null"

#---------------------- i.MX Overrides ---------------------

PACKAGECONFIG:append:class-target = " \
    aio \
    libusb \
    pipewire \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'rutabaga-gfx', '', d)} \
    vhost \
    ${@bb.utils.contains('DISTRO_FEATURES', 'xen', 'vhost-user', '', d)} \
"
