import { Box, Grid } from '@material-ui/core';
import React from 'react';

function Footer (){
    return(
        <>
            <Grid container direction="row" justifyContent="center" alignItems="center">
                <Grid alignItems="center" item xs={12}>
                    <Box style={{backgroundColor: "#3F51B5", height: "120px"}}>
                        
                    </Box>
                </Grid>
            </Grid>
        </>
    )
}

export default Footer;