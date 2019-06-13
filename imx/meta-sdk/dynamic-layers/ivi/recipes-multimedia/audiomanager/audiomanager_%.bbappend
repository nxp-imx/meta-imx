
# replace function in poky/meta/classes/insane.bbclass
python do_qa_staging() {
    bb.note("[workaround] QA checking staging")

    if not qa_check_staged(d.expand('${SYSROOT_DESTDIR}${STAGING_LIBDIR}'), d):
        bb.fatal("QA staging was broken by the package built above")
}
